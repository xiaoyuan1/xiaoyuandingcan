Ext.require(['Ext.data.*', 'Ext.grid.*']);

Ext.define('push.pushModel', {
			extend : 'Ext.data.Model',
			fields : [ {
				name : 'message',
				type : 'string',
				sortable : true
			}, {
				name : 'food',
				type : 'string',
				sortable : true
			}, {
				name : 'lucky',
				type : 'string',
				sortable : true
			}, {
				name : 'code',
				type : 'string',
				sortable : true
			}, {
				name : 'date',
				type : 'string',
				sortable : true
			},{
				name : 'dateCreated',
				type : 'date',
				dateFormat : 'time',
				sortable : true
			}, {
				name : 'dateModified',
				type : 'date',
				dateFormat : 'time',
				sortable : true
			}]
		});

var pageSize = 20;

var store = new Ext.data.Store({
			autoLoad : true,
			autoSync : true,// 需要同步
			model : 'push.PushModel',
			proxy : {
				type : 'rest',
				url : './.json',
				reader : {
					type : 'json',
					root : 'content',
					totalProperty : 'totalElements'
				},
				writer : {
					type : 'json'
				}
			},
			listeners : {
				write : function(store, operation) {
					var record = operation.getRecords()[0], name = Ext.String
							.capitalize(operation.action), verb;
					if (name == 'Destroy') {
						record = operation.records[0];
						verb = 'Destroyed';
					} else {
						verb = name + 'd';
					}
					Ext.example.msg(name, Ext.String.format("{0} user: {1}",
									verb, record.getId()));
				}
			},
			// 每页显示的记录行数
			pageSize : pageSize
		});

var textFieldEditor = {
	xtype : 'textfield',
	allowBlank : false,
	blankText : '该字段不能为空！',
	minLength : 4,
	minText : '至少需要输入{0}个字符！',
	maxLength : 20,
	maxText : '最多输入{0}个字符！'
}

var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
			listeners : {
				cancelEdit : function(rowEditing, context) {
					// Canceling editing of a locally added, unsaved record:
					// remove it
					if (context.record.phantom) {
						store.remove(context.record);
					}
				}
			}
		});

var pushGrid = new Ext.grid.GridPanel({
			id : 'pushGrid',
			plugins : [rowEditing],
			store : store,
			region : 'center',
			columnLines : true,
			loadMask : true,
			stripeRows : true,
			width : 600,
			title : '推送详情',
			columns :[ {
				text : 'DATE',
				width : 50,
				sortable : true,
				dataIndex : 'date'
			}, {
				text : "FOOD",
				width : 120,
				sortable : true,
				dataIndex : 'food'
			}, {
				text : "MESSAGE",
				width : 80,
				sortable : true,
				dataIndex : 'message'
			}, {
				text : "LUCKY",
				width : 80,
				sortable : true,
				dataIndex : 'lucky'
			},{
				text : "添加时间",
				width : 150,
				dataIndex : 'dateCreated',
				renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
				sortable : true
			}, {
				text : "修改时间",
				width : 150,
				dataIndex : 'dateModified',
				renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
				sortable : true
			} ss],
			viewConfig : {
				columnsText : '列',
				sortAscText : '升序',
				sortDescText : '降序'
			},
			tbar : {
				xtype : 'toolbar',
				frame : true,
				border : false,
				padding : 2,
				bbar : new Ext.PagingToolbar({
							pageSize : pageSize,// 每页显示的记录值
							store : store,
							displayInfo : true,
							firstTest : '首页',
							lastText : '尾页',
							nextText : '下页',
							prevText : '前页',
							beforePageText : '第',
							afterPageText : '页，共{0}页',
							displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
							emptyMsg : "没有记录"
						})
			}
		});

pushGrid.getSelectionModel().on('selectionchange',
		function(selModel, selections) {
			pushGrid.down('#delete').setDisabled(selections.length === 0);
		});

new Ext.form.NumberField({
	fieldLabel : '整数',
	allowDecimals : false, // 不允许输入小数
	nanText : '请输入有效整数', // 无效数字提示
	allowNegative : false
		// 不允许输入负数
	});

var clearForm = function() {
	Ext.Msg.alert('重置', '重置查询表单！');
	pushForm.getForm().reset();
}

var queryForm = function() {
	Ext.Msg.alert('查询', '将开始执行查询！');
}

Ext.application({
			name : '推送详情',
			launch : function() {
				Ext.create('Ext.container.Viewport', {
							layout : 'border',
							items : [pushForm, pushGrid]
						});
			}
		});

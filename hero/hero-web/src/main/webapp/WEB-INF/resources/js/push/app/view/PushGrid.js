var pageSize = 5;

var pushStore = Ext.create('push.store.PushStore');
pushStore.load({
	callback : function(records, operation, successful) {
		console.log('department name:', records);
	}
});
Ext.define('push.view.PushGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.pushGrid',
	title : '推送详情',
	store : pushStore,
	columns : [ {
		text : '日期',
		width : 50,
		sortable : true,
		dataIndex : 'date'
	}, {
		text : "推送消息",
		width : 120,
		sortable : true,
		dataIndex : 'message'
	}, {
		text : "推送菜品",
		width : 80,
		sortable : true,
		dataIndex : 'food'
	}, {
		text : "幸运用户",
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
	}],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : pushStore,
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
});


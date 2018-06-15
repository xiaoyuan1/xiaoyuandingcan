Ext.define('depot.view.DepotEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.depotEdit',
	title : '仓库',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'raw',
				fieldLabel : '数量'
			},{
				xtype : 'textfield',
				name : 'code',
				fieldLabel : '菜品'
			},{
				xtype : 'textfield',
				name : 'caipin',
				fieldLabel : '价格'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});

Ext.define('message.view.MessageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.messageEdit',
	title : '编辑学生信息',
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
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'foodname',
				fieldLabel : '菜品'
			}, {
				xtype : 'textfield',
				name : 'productname',
				fieldLabel : '店名'
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

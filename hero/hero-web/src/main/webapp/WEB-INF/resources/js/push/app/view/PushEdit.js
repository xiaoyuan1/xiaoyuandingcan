Ext.define('push.view.PushEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.pushEdit',
	title : '菜单列表',
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
				name : 'message',
				fieldLabel : '推送消息'
			}, {
				xtype : 'textfield',
				name : 'food',
				fieldLabel : '推送菜品'
			}, {
				xtype : 'textfield',
				name : 'lucky',
				fieldLabel : '幸运用户'
			}, {
				xtype : 'textfield',
				name : 'date',
				fieldLabel : '推送日期'
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

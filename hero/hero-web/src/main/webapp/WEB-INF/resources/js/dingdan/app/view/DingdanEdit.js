Ext.define('dingdan.view.DingdanEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.dingdanEdit',
	title : '编辑订单信息',
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
				name : 'orderid',
				fieldLabel : '订单号'
			}, {
				xtype : 'textfield',
				name : 'ordertime',
				fieldLabel : '订单时间'
			}, {
				xtype : 'textfield',
				name : 'orderxinxi',
				fieldLabel : '订单信息'
			}, {
				xtype : 'textfield',
				name : 'orderjiage',
				fieldLabel : '订单价格'
			}, {
				xtype : 'textfield',
				name : 'orderlianxiren',
				fieldLabel : '订单联系人'
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

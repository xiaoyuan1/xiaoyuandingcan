Ext.define('order.view.OrderEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.orderEdit',
	title : '销售样单',
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
				name : 'order_Aprice',
				fieldLabel : '总销售额'
			}, {
				xtype : 'textfield',
				name : 'order_Acost',
				fieldLabel : '总成本'
			}, {
				xtype : 'textfield',
				name : 'order_Aprofit',
				fieldLabel : '净利润'
			}, {
				xtype : 'textfield',
				name : 'order_Adiscount',
				fieldLabel : '折扣券'
			}, {
				xtype : 'textfield',
				name : 'order_Aintegral',
				fieldLabel : '积分'
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

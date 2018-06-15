Ext.define('order.controller.OrderController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.OrderController',
	stores : [ 'OrderStore' ],
	models : [ 'OrderModel' ],
	views : [ 'OrderGrid','OrderEdit'],
	init : function() {
		this.control({
			'orderGrid' : {
				itemdblclick : this.editOrder
			},
			'orderEdit button[action=save]' : {
				click : this.updatOrder
			}
		});
	},
	editOrder : function(grid, record) {
		var view = Ext.widget('orderEdit');
		view.down('form').loadRecord(record);
	},
	updatetOrder : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

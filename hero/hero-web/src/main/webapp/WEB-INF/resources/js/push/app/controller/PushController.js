Ext.define('push.controller.PushController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.pushController',
	stores : [ 'PushStore' ],
	models : [ 'PushModel' ],
	views : [ 'PushGrid','PushEdit'],
	init : function() {
		this.control({
			'pushGrid' : {
				itemdblclick : this.editPush
			},
			'pushEdit button[action=save]' : {
				click : this.updatePush
			}
		});
	},
	editPush : function(grid, record) {
		var view = Ext.widget('pushEdit');
		view.down('form').loadRecord(record);
	},
	updatePush : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

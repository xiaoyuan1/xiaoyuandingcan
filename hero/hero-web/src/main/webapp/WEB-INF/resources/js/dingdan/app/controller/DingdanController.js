Ext.define('dingdan.controller.DingdanController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.dingdanController',
	stores : [ 'DingdanStore' ],
	models : [ 'DingdanModel' ],
	views : [ 'DingdanGrid', 'DingdanEdit' ],
	init : function() {
		this.control({
			'DingdanGrid' : {
				itemdblclick : this.editDingdan
			},
			'dingdanEdit button[action=save]' : {
				click : this.updateDingdan
			}
		});
	},
	editDingdan : function(grid, record) {
		var view = Ext.widget('DingdanEdit');
		view.down('form').loadRecord(record);
	},
	updateDingdan : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

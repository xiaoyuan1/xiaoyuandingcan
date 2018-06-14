Ext.define('foot.controller.FootController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.footController',
	stores : [ 'FootStore' ],
	models : [ 'FootModel' ],
	views : [ 'FootGrid','FootEdit'],
	init : function() {
		this.control({
			'footGrid' : {
				itemdblclick : this.editFoot
			},
			'footEdit button[action=save]' : {
				click : this.updateFoot
			}
		});
	},
	editFoot : function(grid, record) {
		var view = Ext.widget('footEdit');
		view.down('form').loadRecord(record);
	},
	updateFoot : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

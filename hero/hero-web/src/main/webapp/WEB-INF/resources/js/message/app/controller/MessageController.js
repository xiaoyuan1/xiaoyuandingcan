Ext.define('message.controller.MessageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.messageController',
	stores : [ 'MessageStore' ],
	models : [ 'MessageModel' ],
	views : [ 'MessageGrid', 'MessageEdit' ],
	init : function() {
		this.control({
			'messageGrid' : {
				itemdblclick : this.editMessage
			},
			'messageEdit button[action=save]' : {
				click : this.updateMessage
			}
		});
	},
	editMessage : function(grid, record) {
		var view = Ext.widget('messageEdit');
		view.down('form').loadRecord(record);
	},
	updateMessage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

Ext.define('depot.controller.DepotController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.depotController',
	stores : [ 'DepotStore' ],
	models : [ 'DepotModel' ],
	views : [ 'DepotGrid','DepotEdit'],
	init : function() {
		this.control({
			'depotGrid' : {
				itemdblclick : this.editDepot
			},
			'depotEdit button[action=save]' : {
				click : this.updateDepot
			}
		});
	},
	editDepot : function(grid, record) {
		var view = Ext.widget('depotEdit');
		view.down('form').loadRecord(record);
	},
	updateDepot : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

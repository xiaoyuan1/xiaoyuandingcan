Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'depot',
	appFolder : server_context + '/resources/js/depot/app',
	controllers : [ 'DepotController'],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'depotGrid'
			} ]
		});
	}
});

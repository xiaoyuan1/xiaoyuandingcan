Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'dingdan',
	appFolder : server_context + '/resources/js/dingdan/app',
	controllers : [ 'dingdanController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'dingdanGrid'
			} ]
		});
	}
});

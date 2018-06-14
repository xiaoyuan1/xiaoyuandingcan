Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'foot',
	appFolder : server_context + '/resources/js/foot/app',
	controllers : [ 'FootController'],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'footGrid'
			} ]
		});
	}
});

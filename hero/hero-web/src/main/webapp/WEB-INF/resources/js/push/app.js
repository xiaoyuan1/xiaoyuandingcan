Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'push',
	appFolder : server_context + '/resources/js/push/app',
	controllers : [ 'PushController'],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'pushGrid'
			} ]
		});
	}
});

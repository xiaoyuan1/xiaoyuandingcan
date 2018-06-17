Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'message',
	appFolder : server_context + '/resources/js/message/app',
	controllers : [ 'MessageController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'messageGrid'
			} ]
		});
	}
});

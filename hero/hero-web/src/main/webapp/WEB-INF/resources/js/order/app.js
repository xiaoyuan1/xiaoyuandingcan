/**
 * 
 */
Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'order',
	appFolder : server_context + '/resources/js/order/app',
	controllers : [ 'OrderController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'orderGrid'
			} ]
		});
	}
});

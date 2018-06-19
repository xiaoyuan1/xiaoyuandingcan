Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'comment',
	appFolder : server_context + '/resources/js/comment/app',
	controllers : [ 'CommentController'],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'commentGrid'
			} ]
		});
	}
});

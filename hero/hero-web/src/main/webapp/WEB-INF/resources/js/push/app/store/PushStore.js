var pageSize = 20;

Ext.define('push.store.PushStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.pushStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'push.model.PushModel',
	proxy : {
		url : server_context + '/push/.json',
		type : 'ajax',
		api : {
			read : server_context + '/push/.json',
			update : server_context + '/push/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});
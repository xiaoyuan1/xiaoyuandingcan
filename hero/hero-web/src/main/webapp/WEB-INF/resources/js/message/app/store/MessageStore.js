var pageSize = 20;

Ext.define('message.store.MessageStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.messageStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'message.model.MessageModel',
	proxy : {
		url : server_context + '/message/.json',
		type : 'ajax',
		api : {
			read : server_context + '/message/.json',
			update : server_context + '/message/.json'
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
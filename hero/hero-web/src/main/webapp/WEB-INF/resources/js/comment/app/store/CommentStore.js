var pageSize = 5;

Ext.define('comment.store.CommentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.commentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'comment.model.CommentModel',
	proxy : {
		url : server_context + '/comment/.json',
		type : 'ajax',
		api : {
			read : server_context + '/comment/.json',
			update : server_context + '/comment/.json'
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
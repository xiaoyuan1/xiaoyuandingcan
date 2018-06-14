var pageSize = 20;

Ext.define('foot.store.FootStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.footStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'foot.model.FootModel',
	proxy : {
		url : server_context + '/foot/.json',
		type : 'ajax',
		api : {
			read : server_context + '/foot/.json',
			update : server_context + '/foot/.json'
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
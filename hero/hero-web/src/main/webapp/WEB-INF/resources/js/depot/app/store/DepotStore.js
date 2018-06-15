var pageSize = 5;

Ext.define('depot.store.DepotStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.depotStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'depot.model.DepotModel',
	proxy : {
		url : server_context + '/depot/.json',
		type : 'ajax',
		api : {
			read : server_context + '/depot/.json',
			update : server_context + '/depot/.json'
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
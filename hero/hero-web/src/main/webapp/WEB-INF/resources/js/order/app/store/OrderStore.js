var pageSize = 20;

Ext.define('order.store.OrderStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.orderStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'order.model.OrderModel',
	proxy : {
		url : server_context + '/order/.json',
		type : 'ajax',
		api : {
			read : server_context + '/order/.json',
			update : server_context + '/order/.json'
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
var pageSize = 20;

Ext.define('dingdan.store.DingdanStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.dingdanStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'dingdan.model.DingdanModel',
	proxy : {
		url : server_context + '/teach/dingdan/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teach/dingdan/.json',
			update : server_context + '/teach/dingdan/.json'
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
var pageSize = 20;

Ext.define('student.store.StudentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.studentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'student.model.StudentModel',
	proxy : {
		url : server_context + '/student/.json',
		type : 'ajax',
		api : {
			read : server_context + '/student/.json',
			update : server_context + '/student/.json'
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
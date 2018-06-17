Ext.define('message.model.MessageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.messageModel',
	fields : [ {
		name : 'username',
		type : 'string',
		sortable : true
	}, {
		name : 'foodname',
		type : 'string',
		sortable : true
	}, {
		name : 'productname',
		type : 'string',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});
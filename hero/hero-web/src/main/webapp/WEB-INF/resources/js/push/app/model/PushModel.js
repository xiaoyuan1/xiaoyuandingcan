Ext.define('push.model.PushModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.pushModel',
	fields : [ {
		name : 'message',
		type : 'String',
		sortable : true
	}, {
		name : 'food',
		type : 'string',
		sortable : true
	}, {
		name : 'lucky',
		type : 'string',
		sortable : true
	}, {
		name : 'date',
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
	}]
});
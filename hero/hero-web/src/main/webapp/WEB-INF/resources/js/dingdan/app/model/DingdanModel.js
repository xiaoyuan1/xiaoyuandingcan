Ext.define('dingdan.model.DingdanModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.dingdanModel',
	fields : [{
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'orderid',
		type : 'string',
		sortable : true
	}, {
		name : 'ordertime',
		type : 'string',
		sortable : true
	}, {
		name : 'orderxinxi',
		type : 'string',
		sortable : true
	}, {
		name : 'orderjiage',
		type : 'string',
		sortable : true
	}, {
		name : 'orderlianxiren',
		type : 'string',
		sortable : true
	}, {
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
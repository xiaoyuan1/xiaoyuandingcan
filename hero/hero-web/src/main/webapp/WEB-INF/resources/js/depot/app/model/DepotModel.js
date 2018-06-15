Ext.define('depot.model.DepotModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.depotModel',
	fields : [ {
		name : 'raw',
		type : 'string',
		sortable : true
	},{
		name : 'caipin',
		type : 'string',
		sortable : true
	},{
		name : 'code',
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
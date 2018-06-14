Ext.define('foot.model.FootModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.footModel',
	fields : [ {
		name : 'id',
		type : 'long',
		sortable : true
	}, {
		name : 'shop_id',
		type : 'int',
		sortable : true
	}, {
		name : 'product_name',
		type : 'string',
		sortable : true
	}, {
		name : 'product_price',
		type : 'string',
		sortable : true
	}, {
		name : 'product_introduce',
		type : 'string',
		sortable : true
	}, {
		name : 'product_state',
		type : 'boolean',
		sortable : true
	}, {
		name : 'product_volume',
		type : 'string',
		sortable : true
	}, {
		name : 'product_biaohao',
		type : 'date',
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
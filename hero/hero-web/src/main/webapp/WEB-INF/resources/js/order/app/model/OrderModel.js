Ext.define('order.model.OrderModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.orderModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'order_Aprice',
		type : 'String',
		sortable : true
	}, {
		name : 'order_Acost',
		type : 'String',
		sortable : true
	}, {
		name : 'order_Aprofit',
		type : 'String',
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
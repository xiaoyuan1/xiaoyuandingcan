Ext.define('comment.model.CommentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.commentModel',
	fields : [ {
		name : 'comment',
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
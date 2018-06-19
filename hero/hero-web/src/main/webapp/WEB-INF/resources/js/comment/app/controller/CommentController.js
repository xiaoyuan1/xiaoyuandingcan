Ext.define('comment.controller.CommentController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.commentController',
	stores : [ 'CommentStore' ],
	models : [ 'CommentModel' ],
	views : [ 'CommentGrid','CommentEdit'],
	init : function() {
		this.control({
			'commentGrid' : {
				itemdblclick : this.editComment
			},
			'commentEdit button[action=save]' : {
				click : this.updateComment
			}
		});
	},
	editComment : function(grid, record) {
		var view = Ext.widget('commentEdit');
		view.down('form').loadRecord(record);
	},
	updateComment : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

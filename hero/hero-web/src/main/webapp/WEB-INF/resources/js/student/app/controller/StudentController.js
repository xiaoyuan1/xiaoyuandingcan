Ext.define('student.controller.StudentController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.studentController',
	stores : [ 'StudentStore' ],
	models : [ 'StudentModel' ],
	views : [ 'StudentGrid', 'StudentEdit' ],
	init : function() {
		this.control({
			'studentGrid' : {
				itemdblclick : this.editStudent
			},
			'studentEdit button[action=save]' : {
				click : this.updateStudent
			}
		});
	},
	editStudent : function(grid, record) {
		var view = Ext.widget('studentEdit');
		view.down('form').loadRecord(record);
	},
	updateStudent : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

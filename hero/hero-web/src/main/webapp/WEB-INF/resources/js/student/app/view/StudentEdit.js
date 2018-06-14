Ext.define('student.view.StudentEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.studentEdit',
	title : '编辑学生信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'code',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'fullName',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'gender',
				fieldLabel : '性别'
			}, {
				xtype : 'textfield',
				name : 'major',
				fieldLabel : '专业'
			}, {
				xtype : 'textfield',
				name : 'grade',
				fieldLabel : '年级'
			}, {
				xtype : 'textfield',
				name : 'clazz',
				fieldLabel : '班级'
			} ]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});

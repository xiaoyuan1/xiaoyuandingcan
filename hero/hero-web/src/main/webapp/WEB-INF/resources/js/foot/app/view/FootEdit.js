Ext.define('foot.view.FootEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.footEdit',
	title : '菜单列表',
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
				name : 'id',
				fieldLabel : 'ID'
			}, {
				xtype : 'textfield',
				name : 'shop_id',
				fieldLabel : '商店id'
			}, {
				xtype : 'textfield',
				name : 'product_name',
				fieldLabel : '菜品名称'
			}, {
				xtype : 'textfield',
				name : 'product_price',
				fieldLabel : '菜品价格'
			}, {
				xtype : 'textfield',
				name : 'product_introduce',
				fieldLabel : '菜品介绍'
			}, {
				xtype : 'textfield',
				name : 'product_state',
				fieldLabel : '是否下架'
			}, {
				xtype : 'textfield',
				name : 'product_volume',
				fieldLabel : '销量'
			}, {
				xtype : 'textfield',
				name : 'product_biaohao',
				fieldLabel : '菜品编号'
			}]
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

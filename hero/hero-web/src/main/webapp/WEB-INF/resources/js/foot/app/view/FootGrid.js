var pageSize = 5;

var footStore = Ext.create('foot.store.FootStore');
footStore.load({
	callback : function(records, operation, successful) {
		console.log('department name:', records);
	}
});
Ext.define('foot.view.FootGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.footGrid',
	title : '菜单列表',
	store : footStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "商店id",
		width : 120,
		sortable : true,
		dataIndex : 'shop_id'
	}, {
		text : "菜品名称",
		width : 80,
		sortable : true,
		dataIndex : 'product_name'
	}, {
		text : "菜品价格",
		width : 80,
		sortable : true,
		dataIndex : 'product_price'
	}, {
		text : "菜品介绍",
		width : 80,
		sortable : true,
		dataIndex : 'product_introduce'
	}, {
		text : "是否下架",
		width : 80,
		sortable : true,
		dataIndex : 'product_state'
	}, {
		text : "销量",
		width : 80,
		sortable : true,
		dataIndex : 'product_volume'
	}, {
		text : "菜品编号",
		width : 80,
		sortable : true,
		dataIndex : 'product_biaohao'
	},{
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : footStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});


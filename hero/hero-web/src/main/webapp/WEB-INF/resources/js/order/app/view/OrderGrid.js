var pageSize = 5;

var orderStore = Ext.create('order.store.OrderStore');

Ext.define('order.view.OrderGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.orderGrid',
	title : '销售样单',
	store : orderStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : '总销售额',
		width : 50,
		sortable : true,
		dataIndex : 'order_Aprice'
	}, {
		text : "总成本",
		width : 120,
		sortable : true,
		dataIndex : 'order_Acost'
	}, {
		text : "净利润",
		width : 80,
		sortable : true,
		dataIndex : 'order_Aprofit'
	}, {
		text : "折扣券",
		width : 80,
		sortable : true,
		dataIndex : 'order_Adiscount'
	}, {
		text : "积分",
		width : 80,
		sortable : true,
		dataIndex : 'order_Aintegral'
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
		store : orderStore,
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


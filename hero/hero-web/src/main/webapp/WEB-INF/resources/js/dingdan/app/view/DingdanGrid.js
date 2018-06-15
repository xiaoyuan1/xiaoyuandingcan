var pageSize = 20;

var dingdanStore = Ext.create('dingdan.store.DingdanStore');
dingdanStore.load({
	callback : function(records, operation, successful) {
		console.log('department name:', records);
	}
});
Ext.define('dingdan.view.DingdanGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.dingdanGrid',
	title : '校园订餐  订单-信息列表',
	store : dingdanStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "订单号",
		width : 120,
		sortable : true,
		dataIndex : 'orderid'
	}, {
		text : "订单时间",
		width : 80,
		sortable : true,
		dataIndex : 'ordertime'
	}, {
		text : "订单信息",
		width : 300,
		sortable : true,
		dataIndex : 'orderxinxi'
	}, {
		text : " 订单价格",
		width : 80,
		sortable : true,
		dataIndex : 'orderjiage'
	}, {
		text : "订单联系人",
		width : 100,
		sortable : true,
		dataIndex : 'orderlianxiren'
	}, {
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
		store : dingdanStore,
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

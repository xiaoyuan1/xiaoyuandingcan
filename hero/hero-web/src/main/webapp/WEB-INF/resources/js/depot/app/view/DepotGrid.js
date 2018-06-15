var pageSize = 5;

var depotStore = Ext.create('depot.store.DepotStore');
depotStore.load({
	callback : function(records, operation, successful) {
		console.log('department name:', records);
	}
});
Ext.define('depot.view.DepotGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.depotGrid',
	title : '仓库',
	store : depotStore,
	columns : [ {
		text : '数量',
		width : 50,
		sortable : true,
		dataIndex : 'raw'
	},{
		text : '菜品',
		width : 50,
		sortable : true,
		dataIndex : 'code'
	},{
		text : '价格',
		width : 50,
		sortable : true,
		dataIndex : 'caipin'
	},
	{
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
		store :depotStore,
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


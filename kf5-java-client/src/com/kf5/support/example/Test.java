package com.kf5.support.example;

import com.kf5.support.controller.KF5Support;

public class Test {

	public static void main(String[] args) {
		
		KF5Support kf5Support = new KF5Support();
//		kf5Support.initWithApiToken("tianxiang.kf5.com", "123456789@qq.com", "8a677837e8f2b572ab7e8f2b57");
//		kf5Support.initWithPassword("tianxiang.kf5.com", "123456789@qq.com", "123456");
//		kf5Support.getAgentOrderList();
//		kf5Support.getAgentOrderListWithID("258");
//		kf5Support.getAgentTicketDetail("32");
//		kf5Support.getAgentManyTickets("32,1");
//		kf5Support.createAgentOrder("{ticket:{title: \"Let's create ticket\",\"comment\": {\"content\": \"what are you waiting for?\"}}}");
//		kf5Support.updateAgentOrder("2279","{ticket:{title: \"��������\",\"comment\": {\"content\": \"what are you waiting for?\"}}}");
//		kf5Support.updateManyAgentOrder("1", "{\"ticket\": {\"title\": \"�������ү\"}}");
//		kf5Support.deleteAgentOrder("2279");
//		kf5Support.deleteManyAgentOrders("2282,2280");
//		kf5Support.getAgentOrderCollaborators("1");
//		kf5Support.getAgentOrderIncidentList("32");
//		kf5Support.getAgentOrderProblemList();
//		kf5Support.getRequesterOrderList();
//		kf5Support.getRequesterOrderListStatusOpen();
//		kf5Support.getRequesterOrderListStatusSolved();
//		kf5Support.getRequesterOrderListByID("586");
//		kf5Support.getOrganizationOrderList("17783");
//		kf5Support.searchOrderByEndUser("status=open");
//		kf5Support.getOrderDetailByEndUser("288");
//		kf5Support.createOrderByEndUser("{\"request\":{\"title\": \"create ticket\",\"comment\": {\"content\": \"what are you waiting for?\"}}}");
//		kf5Support.replyOrderByEndUser("288", "{\"request\":{\"title\": \"���ү\",\"comment\": {\"content\": \"what are you waiting for?\"}}}");
//		kf5Support.getCommentListByEndUser("288");
//		kf5Support.getOrderCommentWithID(null, "205586");
//		kf5Support.getOrderCommentList("32");
//		kf5Support.getTicketFieldList();
//		kf5Support.getTicketFieldListActive();
//		kf5Support.getTicketFieldByID("103");
//		kf5Support.deleteTicketFieldByID("4183");
//		kf5Support.getOrderTypeList();
//		kf5Support.getOrderTypeListActive();
//		kf5Support.getOrderTypeByID("241284");
//		kf5Support.getTicketListByTypeID("284859");
//		kf5Support.getTicketCountByTypeID("284859");
//		kf5Support.getManyTicketCountByTypeIds("284859,241284");
//		kf5Support.getUserList();
//		kf5Support.getUserInfo("123");
//		kf5Support.getMyInfo();
//		kf5Support.getManyUsersInfo("123,122");
//		kf5Support.createUserInfo("{\"user\": {\"name\": \"liuming\", \"email\": \"liuming135@qq.com\"}}");//���Դ����Ѵ����û���bug
//		kf5Support.mergeUser("589280", "{\"user\": {\"id\": 123}}");
//		kf5Support.updateUserInfo("10556", "{\"user\": {\"name\": \"���ү\"}}");
//		kf5Support.deleteUser("10961");
//		kf5Support.searchUser("123");
//		kf5Support.getUserFieldList();
//		kf5Support.getUserFieldActiveList();
//		kf5Support.getUserFieldListByID("35");
//		kf5Support.deleteUserField("1");
//		kf5Support.getGroupList();
//		kf5Support.getGroupListByID("13436");
//		kf5Support.createGroup("{\"group\": {\"name\": \"My Group\"}}");
//		kf5Support.updateGroup("13436", "{\"group\": {\"name\": \"Interesting123 Group\"}}");
//		kf5Support.deleteGroup("13434");
//		kf5Support.getOrganizationList();
//		kf5Support.getOrganizationByID("55");
//		kf5Support.createOrganization("{\"organization\": {\"name\": \"My Organization\"}}");
//		kf5Support.updateOrganization("16004","{\"organization\": {\"description\": \"�Ǻǣ����޸�һ��\"}}");
//		kf5Support.deleteOrganization("19845");
//		kf5Support.getTopicList();
//		kf5Support.getTopicByID("11593");
//		kf5Support.createTopic("{\"topic\": {\"title\": \"this is topic title\",\"description\": \"description123465\"}}");
//		kf5Support.updateTopic("11784", "{\"topic\": {\"title\": \"�±���\"}}");
//		kf5Support.deleteTopic("11784");
//		kf5Support.getQuestionList();
//		kf5Support.getQuestionByID("2617");
//		kf5Support.createQuestion("{\"question\": {\"title\": \"�������ү\",\"topic_id\": 8881,\"content\": \"this is content\"}}");
//		kf5Support.updateQuestion("3301", "{\"question\": {\"title\": \"�޸ı���\"}}");
//		kf5Support.deleteQuestion("3292");
//		kf5Support.getQuestionCommentList("3207");
//		kf5Support.getQuestionCommentByID("3207", "2715");
//		kf5Support.replyQuestion("3207", "{\"request\": {\"comment\": {\"content\": \"�������ү\"}}}");
//		kf5Support.getCategoriesList();
//		kf5Support.getCategoryByID("12268");
//		kf5Support.createCategory("{\"category\": {\"title\": \"post category\",\"content\": \"this is content\"}}");
//		kf5Support.updateCategory("12268", "{\"category\": {\"title\": \"�̻�����1\"}}");
//		kf5Support.deleteCategory("13546");
//		kf5Support.getForumList();
//		kf5Support.getForumByID("40537");
//		kf5Support.createForum("{\"forum\": {\"title\": \"this is forums title\",\"category_id\": \"10232\",\"content\": \"this is content\",\"role_view\": \"all\"}}");
//		kf5Support.updateForum("53112", "{\"forum\": {\"title\": \"�Ǻ�\"}}");
//		kf5Support.deleteForum("53112");
//		kf5Support.getPostList();
//		kf5Support.getPostByID("75491");
//		kf5Support.getManyPosts("75491,70879,70873");
//		kf5Support.searchPost("7");
//		kf5Support.createPost("{\"post\": {\"title\": \"this is post title\",\"forum_id\":47630,\"content\": \"this is content\"}}");
//		kf5Support.updatePost("76180", "{\"post\": {\"title\": \"�޸��ĵ�\"}}");
//		kf5Support.deletePost("75584");
//		kf5Support.getPostCommentList("70873");
//		kf5Support.getPostCommentByID("70873", "3896");
//		kf5Support.postReply("70873", "{\"post_comment\": {\"content\": \"this is api test content\"}}");
//		kf5Support.uploadAttachment("D://icon.jpg");
//		kf5Support.viewAttachment("225709");
//		kf5Support.deleteAttachment("223997");
//		kf5Support.importOrder("{\"ticket\": {\"requester_id\":586,\"title\": \"Help\", \"comments\": [{ \"author_id\": 563265, \"content\": \"This is a comment\"}]}}");
//		kf5Support.orderExport("");
	}

}
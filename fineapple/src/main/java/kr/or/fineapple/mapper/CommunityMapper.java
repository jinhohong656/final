package kr.or.fineapple.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.or.fineapple.domain.User;
import kr.or.fineapple.domain.community.Board;
import kr.or.fineapple.domain.community.Cmnt;
import kr.or.fineapple.domain.community.Group;
import kr.or.fineapple.domain.community.GroupUser;
import kr.or.fineapple.domain.community.Report;

@Mapper
@Repository
public interface CommunityMapper {
	
	public void addPost(Board board);
	
	public void addCmnt(Cmnt cmnt);
 	
	public List<Board> getPostList();
	
	public Board getPost(Board board);
	
	public List<Cmnt> getCmntList(Board board);
	
	public void updatePostViewCount(Board board);
	
	public void addPostLike(Board board);
	
	public void deletePostLike(Board board);
	
	public void updatePost(Board board);
	
	public void updateCmnt(Cmnt cmnt);
	
	public void addGroup(Group group);
	
	public void addGroupUser(GroupUser groupUser);
	
	public void deleteGroupUser(GroupUser groupUser);
	
	public List<Group> getGroupList();
	
	public Group getGroup(Group group);
	
	public List<GroupUser> getGroupUserList(Group group);
	
	public List<Group> getMyGroupList(GroupUser groupUser);
	
	public List<Group> getGroupInterGroup(GroupUser groupUser);
	
	public List<User> getGroupInterUser(GroupUser groupUser);
	
	public void addReport(Report report);
	
}

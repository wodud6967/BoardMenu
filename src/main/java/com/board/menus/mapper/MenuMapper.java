package com.board.menus.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.board.menus.domain.MenuVo;

import lombok.NonNull;

@Mapper
public interface MenuMapper {

   void insertMenu(MenuVo menuVo);

   List<MenuVo> getMenuList();

   void deleteMenu(MenuVo menuVo);

   void insertMenuByName(MenuVo menuVo);

   MenuVo getMenu(@NonNull String menu_id);

   void updateMenu(MenuVo menuVo);

   
   
}

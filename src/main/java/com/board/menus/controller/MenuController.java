package com.board.menus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.menus.domain.MenuVo;
import com.board.menus.mapper.MenuMapper;

@Controller
@RequestMapping("/Menus")
public class MenuController {

   @Autowired
   private MenuMapper menuMapper;
   
   // 메뉴 목록 조회
   @RequestMapping("/List")
   public String list(Model model) {
      // 조회한 결과를 ArrayList 로 돌려준다
      List<MenuVo>  menuList = menuMapper.getMenuList();
      // 조회 결과를 넘겨 준다 (Model)
      model.addAttribute("menuList", menuList);
      System.out.println("MenuController list() menuList=" + menuList);
      //fsdlfnewslf
      //fdshflwe
      return "menus/list";
   }
   
   
   
   
   // 메뉴 입력받는 화면   //@RequestMapping("/Menus/WriteForm")
   @RequestMapping("/WriteForm")
   public String writeForm() {
      return "menus/write";  // /WEB-INF/views/ + menu/write + .jsp  
   }
   
   
   // 메뉴 저장              // /Menus/Write
   @RequestMapping("/Write")
   public String write(
         MenuVo menuVo ) {
      // 넘어온 데이터를 db 에 저장하고
      // /Menus/Write?menu_id=MENU02&menu_name=JSP&menu_seq=2
      //menuMapper.insertMenu(menu_id,menu_name,menu_seq);
      menuMapper.insertMenu(menuVo);
      return "menus/list";
   }
   
}

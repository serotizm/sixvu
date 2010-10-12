package com.sixvu.webui;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.sixvu.domain.Video;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "videos", formBackingObject = Video.class, delete=false)
@RequestMapping("/videos")
@Controller
public class VideoController {
}

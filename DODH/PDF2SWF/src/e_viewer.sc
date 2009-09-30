################################################### #
# Extended viewer
#
# http://technoargia.free.fr/swftools/ - june 17 - 2006 #
###################################################

.flash filename=E_viewer.swf bbox=100x50

        .box button_idle width=20 height=60 color=blue fill=salmon line=5
        .box button_hover width=20 height=60 color=red fill=salmon line=6
        .box button_pressed width=20 height=60 color=gray fill=salmon line=5
        .box page_progress_bar width=110 height=10 color=white line=2
        .box page_current_page width=10 height=10 color=black fill=white line=0
#       .box cadre_menu width=50 height=150 color=navy fill=salmon line=2
        .box border_left width=5 height=800 color=gray fill=white line=3

        .edittext info text="info" color=black size=100% width=60 height=60 align=center border=none noselect variable=infoText

.outline o_cadre:

        M 12.3,-1.2483537 
        L 40.130855,-1.2483537 
        C 46.945055,-1.2483537 52.430855,4.2374464 52.430855,11.051646 
        L 52.430855,170.58475 
        C 52.430855,170.58475 46.945055,176.07055 40.130855,176.07055 
        L 12.3,176.07055 C 5.4858001,176.07055 0,170.58475 0,170.77055 
        L 0,11.051646 C 0,4.2374464 5.4858001,-1.2483537 12.3,-1.2483537 z 

.end
.outline o_arrow:

        M 60.208843,38.698967 
        L 97.86712,38.698967 
        C 97.86712,38.698967 96.176907,25.416467 101.5254,22.698967
        C 106.94202,19.946851 132.17198,46.056049 131.84195,55.551743 
        C 131.50046,65.377079 105.79971,91.679067 101.5254,88.404518 
        C 97.332023,85.191969 97.86712,72.404518 97.86712,72.404518 
        L 60.208843,72.404518 
        C 57.438843,72.404518 55.208843,70.174518 55.208843,67.404518 
        L 55.208843,43.698967 
        C 55.208843,40.928967 57.438843,38.698967 60.208843,38.698967 z 
.end

.outline o_home:

        M -53.886767,76.403498 
        L -53.886767,34.745221 
        C -53.886767,34.745221 -63.829917,35.216428 -63.886767,31.086941 
        C -63.943617,26.792438 -48.173573,15.507804 -48.173573,15.507804
        L -48.460379,-0.8375205 
        L -39.603782,-0.8609028
        L -39.441205,10.503755 
        C -39.441205,10.503755 -33.561078,0.91501123 -25.033991,0.770391 
        C -16.671921,0.62577077 10.039242,25.68734 11.818784,31.086941 
        C 13.581482,36.435434 1.818784,34.745221 1.818784,34.745221 
        L 1.818784,76.403498 
        C 1.818784,79.173498 -0.411216,81.4035 -3.181216,81.4035 
        L -48.886767,81.4035 
        C -51.656767,81.4035 -53.886767,79.173498 -53.886767,76.403498 z 

.end

.outline o_lastPage:

        M -53.886767,76.403498 
        L -53.886767,34.745221 
        C -53.886767,34.745221 -63.829917,35.216428 -63.886767,31.086941 
        C -63.943617,26.792438 -48.173573,15.507804 -48.173573,15.507804
        L -48.460379,-0.8375205 
        L -39.603782,-0.8609028
        L -39.441205,10.503755 
        C -39.441205,10.503755 -33.561078,0.91501123 -25.033991,0.770391 
        C -16.671921,0.62577077 10.039242,25.68734 11.818784,31.086941 
        C 13.581482,36.435434 1.818784,34.745221 1.818784,34.745221 
        L 1.818784,76.403498 
        C 1.818784,79.173498 -0.411216,81.4035 -3.181216,81.4035 
        L -48.886767,81.4035 
        C -51.656767,81.4035 -53.886767,79.173498 -53.886767,76.403498 z 

.end

        .filled home_idle outline=o_home fill=#336699 color=navy line=4
        .filled home_hover outline=o_home fill=#3366ff color=salmon line=4
        .filled home_pressed outline=o_home fill=#4466ff color=red line=3
        
        .filled last_idle outline=o_lastPage fill=#336699 color=navy line=4
        .filled last_hover outline=o_lastPage fill=#3366ff color=salmon line=4
        .filled last_pressed outline=o_lastPage fill=#4466ff color=red line=3
        
        .filled arrow_idle outline=o_arrow fill=#336699 color=navy line=4
        .filled arrow_hover outline=o_arrow fill=#3366ff color=salmon line=4
        .filled arrow_pressed outline=o_arrow fill=#4466ff color=red line=3

        .filled cadre_menu outline=o_cadre fill=salmon color=grey line=3

.button next

        .show arrow_idle as=idle
        .show arrow_idle as=area
        .show arrow_hover as=hover
        .show arrow_pressed as=pressed
        # ActionScript
        .on_release:
        _root.viewport.nextFrame();
        _root.updateInfo();
        .end

.end

.button prev

        .show arrow_idle as=idle
        .show arrow_idle as=area
        .show arrow_hover as=hover
        .show arrow_pressed as=pressed
        # ActionScript
        .on_release:
        _root.viewport.prevFrame();
        _root.updateInfo();
        .end

.end

.button lastPage

		.show last_idle as=idle
		.show last_idle as=area
		.show last_hover as=hover
		.show last_pressed as=pressed
		# ActionScript
		.on_release:
		_root.viewport.gotoAndStop(_root.viewport._totalframes);
		_root.updateInfo();
		.end

.end

.button home

        .show home_idle as=idle
        .show home_idle as=area 
        .show home_hover as=hover
        .show home_pressed as=pressed
        # ActionScript
        .on_release:
        _root.viewport.gotoAndStop(1);
        _root.updateInfo();

        /* you can change to your home frame number */
        .end

.end

.button menu_left

        .show border_left as=area alpha=0%
        .on_move_in :
        showMenu();
        .end

.end

.sprite viewport

# slave movie go here
.end

        .put viewport
        .put menu_left

.sprite page_bar
.frame 1
	.put page_progress_bar x=0 y=0
	.put page_current_page x=0 y=0
	.stop
.frame 100
	.change page_current_page x=100
.end

.sprite C_menu

        .put cadre_menu y=5 alpha=90%
        .put home pin=center x=25 y=28 scale=40% alpha=50% rotate=-90
        .put prev pin=center x=25 y=65 scale=40% alpha=50% rotate=180
        .put next pin=center x=25 y=95 scale=40% alpha=50% rotate=0
        .put lastPage pin=center x=25 y=132 scale=40% alpha=50% rotate=90
        .put page_bar x=52 y=25 rotate=90

.end

.sprite s_menu
.frame 1

        .put C_menu x=-60
        .put info x=-65 y=147 alpha=50%

.frame 40

        .change C_menu x=5
        .change info x=0
        .stop

.frame 80

        .change C_menu x=-60
        .change info x=-65
        .stop

.end

.action:

        _root.viewport.stop();
        _root.createEmptyMovieClip("menu",500);
        _root.attachMovie("s_menu","menu",500);

        info._alpha = 50;
        info.embedFonts = 0;
        var monStyle = new TextFormat();
        monstyle.bold = false;
        monStyle.italic = false;
        monStyle.border = false;
        monStyle.font = "_sans";
        _root.menu.info.setTextFormat(monStyle);

        _root.menu.infoText = "Page\r" + String(_root.viewport._currentframe) + "/" + String(_root.viewport._totalframes);
        
        function showMenu() {
         _root.menu._y = _root.viewport._ymouse - 60;
          if(_root.menu._y < 0) {
          _root.menu._y = 0;
          };
          _root.menu.Play();
        };
         
        //function updateInfo() {
        //  _root.menu.infoText = "Page\r" + String(_root.viewport._currentframe) + "/" + String(_root.viewport._totalframes);
        //};
        	function updateInfo() {
		var page = _root.viewport._currentframe;
		var total = _root.viewport._totalframes;

		var pos = Math.floor(
			( page - 1 ) / ( total - 1 ) * 100
		);

		if ( pos == 0 ) pos = 1;

		_root.menu.infoText = "Page\r" + String(page) + "/" + String(total);
//		_root.menu.C_menu.infoText = String(page) + " / " + String(total)
//			+ "\r" + String(pos)
			;
		_root.menu.C_menu.page_bar.gotoAndStop( pos );
	};

        
        // Actionscript Žvnements touches

        waitouches = new Object();
        waitouches.onKeyDown = function () {
        keydownrun=true;
        _root.kd=Key.getCode();
        switch(Key.getCode()) {
                case 40: //Key.DOWN:
                         _root.viewport.nextFrame();
                         updateInfo();
                        break;
                case 38: //Key.UP:
                         _root.viewport.prevFrame();
                         updateInfo();
                        break;
                case 33: //Page prŽcŽdente:
                        numPage = _root.viewport._currentframe - 5;
                        if(numPage < 1) {
                        _root.viewport.gotoAndStop(1);
                        } else {
                        _root.viewport.gotoAndStop(numPage);
                        };
                        updateInfo();
                        break;
                case 34: //Page suivante:
                        numPage = _root.viewport._currentframe + 5;
                        if(numPage > _root.viewport._totalframes) {
                        _root.viewport.gotoAndStop(_root.viewport._totalframes);
                        } else {
                        _root.viewport.gotoAndStop(numPage);
                        };
                        updateInfo();
                        break;
                case 35: //Key.End:
                        _root.viewport.gotoAndStop(_root.viewport._totalframes);
                         updateInfo();

                        break;
                case 36: //Key.Home:
                         _root.viewport.gotoAndStop(1);
                         updateInfo();

                        break;
                case 37: //Key.left:
                        ShowMenu();
                        break;
                case 39: //Key.Right:
                        ShowMenu();
                        break;

        }
        updateAfterEvent();
        };

        Key.addListener(waitouches);

.end

.end 

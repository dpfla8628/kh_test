(function()
{
    return function()
    {
        if (!this._is_form)
            return;
        
        var obj = null;
        
        this.on_create = function()
        {
            this.set_name("Form_Work");
            this.set_titletext("Form_Work");
            if (Form == this.constructor)
            {
                this._setFormPosition(1280,720);
            }
            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("personDs", this);
            obj._setContents("<ColumnInfo><Column id=\"emp_no\" type=\"STRING\" size=\"256\"/><Column id=\"emp_name\" type=\"STRING\" size=\"256\"/><Column id=\"position\" type=\"STRING\" size=\"256\"/><Column id=\"department\" type=\"STRING\" size=\"256\"/><Column id=\"hire_date\" type=\"DATE\" size=\"256\"/><Column id=\"emp_phone\" type=\"STRING\" size=\"256\"/><Column id=\"emp_email\" type=\"STRING\" size=\"256\"/></ColumnInfo>");
            this.addChild(obj.name, obj);


            obj = new Dataset("combo", this);
            obj._setContents("<ColumnInfo><Column id=\"code\" type=\"STRING\" size=\"256\"/><Column id=\"value\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"code\">emp_name</Col><Col id=\"value\">이름</Col></Row><Row><Col id=\"code\">position</Col><Col id=\"value\">직급</Col></Row><Row><Col id=\"code\">department</Col><Col id=\"value\">부서</Col></Row></Rows>");
            this.addChild(obj.name, obj);
            
            // UI Components Initialize
            obj = new Static("Static00","65","34","110","44",null,null,null,null,null,null,this);
            obj.set_taborder("0");
            obj.set_text("사원 관리");
            obj.set_font("bold 20px/normal \"Gulim\"");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00","150","142","116","20",null,null,null,null,null,null,this);
            obj.set_taborder("1");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00_00","150","106","116","20",null,null,null,null,null,null,this);
            obj.set_taborder("2");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00_00_00","150","176","116","20",null,null,null,null,null,null,this);
            obj.set_taborder("3");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00_00_00_00","150","206","116","20",null,null,null,null,null,null,this);
            obj.set_taborder("4");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00_00_00_00_00_00","150","272","116","24",null,null,null,null,null,null,this);
            obj.set_taborder("5");
            this.addChild(obj.name, obj);

            obj = new Edit("Edit00_00_00_00_00_00_00","150","306","116","20",null,null,null,null,null,null,this);
            obj.set_taborder("6");
            this.addChild(obj.name, obj);

            obj = new Grid("Grid00","297","131","550","211",null,null,null,null,null,null,this);
            obj.set_taborder("7");
            obj.set_binddataset("personDs");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"48\"/><Column size=\"84\"/><Column size=\"82\"/><Column size=\"194\"/><Column size=\"110\"/></Columns><Rows><Row size=\"24\" band=\"head\"/><Row size=\"24\" band=\"head\"/><Row size=\"24\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell rowspan=\"2\" text=\"번호\"/><Cell col=\"1\" rowspan=\"2\" text=\"이름\"/><Cell col=\"2\" text=\"직급\"/><Cell col=\"3\" text=\"전화번호\"/><Cell col=\"4\" rowspan=\"2\" text=\"입사일\"/><Cell row=\"1\" col=\"2\" text=\"부서\"/><Cell row=\"1\" col=\"3\" text=\"이메일\"/></Band><Band id=\"body\"><Cell rowspan=\"2\" text=\"bind:emp_no\"/><Cell col=\"1\" rowspan=\"2\" text=\"bind:emp_name\"/><Cell col=\"2\" text=\"bind:position\"/><Cell col=\"3\" text=\"bind:emp_phone\"/><Cell col=\"4\" rowspan=\"2\" text=\"bind:hire_date\" calendardateformat=\"yyyy-MM-dd\"/><Cell row=\"1\" col=\"2\" text=\"bind:department\"/><Cell row=\"1\" col=\"3\" text=\"bind:emp_email\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Edit("keyword","440","88","145","28",null,null,null,null,null,null,this);
            obj.set_taborder("8");
            this.addChild(obj.name, obj);

            obj = new Button("Button00","602","89","50","26",null,null,null,null,null,null,this);
            obj.set_taborder("9");
            obj.set_text("검색");
            this.addChild(obj.name, obj);

            obj = new Button("Button00_00","657","88","50","26",null,null,null,null,null,null,this);
            obj.set_taborder("10");
            obj.set_text("목록");
            this.addChild(obj.name, obj);

            obj = new Button("Button00_01","560","360","50","26",null,null,null,null,null,null,this);
            obj.set_taborder("11");
            obj.set_text("추가");
            this.addChild(obj.name, obj);

            obj = new Button("Button00_01_00","615","360","50","26",null,null,null,null,null,null,this);
            obj.set_taborder("12");
            obj.set_text("삭제");
            this.addChild(obj.name, obj);

            obj = new ListView("ListView00","75","422","470","168",null,null,null,null,null,null,this);
            obj.set_taborder("13");
            obj.set_binddataset("personDs");
            obj._setContents("<Formats><Format id=\"default\"><Band id=\"body\" width=\"100%\" height=\"208\"><Cell id=\"Cell00\" left=\"10\" top=\"5\" width=\"120\" height=\"24\" text=\"emp_no\"/><Cell id=\"Cell01\" left=\"135\" top=\"5\" width=\"180\" height=\"24\" text=\"bind:emp_no\"/><Cell id=\"Cell02\" left=\"10\" top=\"34\" width=\"120\" height=\"24\" text=\"emp_name\"/><Cell id=\"Cell03\" left=\"135\" top=\"34\" width=\"180\" height=\"24\" text=\"bind:emp_name\"/><Cell id=\"Cell04\" left=\"10\" top=\"63\" width=\"120\" height=\"24\" text=\"position\"/><Cell id=\"Cell05\" left=\"135\" top=\"63\" width=\"180\" height=\"24\" text=\"bind:position\"/><Cell id=\"Cell06\" left=\"10\" top=\"92\" width=\"120\" height=\"24\" text=\"department\"/><Cell id=\"Cell07\" left=\"135\" top=\"92\" width=\"180\" height=\"24\" text=\"bind:department\"/><Cell id=\"Cell08\" left=\"10\" top=\"121\" width=\"120\" height=\"24\" text=\"hire_date\"/><Cell id=\"Cell09\" left=\"135\" top=\"121\" width=\"180\" height=\"24\" text=\"bind:hire_date\"/><Cell id=\"Cell10\" left=\"10\" top=\"150\" width=\"120\" height=\"24\" text=\"emp_phone\"/><Cell id=\"Cell11\" left=\"135\" top=\"150\" width=\"180\" height=\"24\" text=\"bind:emp_phone\"/><Cell id=\"Cell12\" left=\"10\" top=\"179\" width=\"120\" height=\"24\" text=\"emp_email\"/><Cell id=\"Cell13\" left=\"135\" top=\"179\" width=\"180\" height=\"24\" text=\"bind:emp_email\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Static("Static01","115","106","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("14");
            obj.set_text("번호");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00","114","142","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("15");
            obj.set_text("이름");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00_00","114","171","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("16");
            obj.set_text("직급");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00_00_00","113","205","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("17");
            obj.set_text("부서");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00_00_00_00","112","239","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("18");
            obj.set_text("입사일");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00_00_00_00_00","100","273","47","17",null,null,null,null,null,null,this);
            obj.set_taborder("19");
            obj.set_text("전화번호");
            this.addChild(obj.name, obj);

            obj = new Static("Static01_00_00_00_00_00_00","111","305","35","19",null,null,null,null,null,null,this);
            obj.set_taborder("20");
            obj.set_text("이메일");
            this.addChild(obj.name, obj);

            obj = new Combo("type","297","80","140","40",null,null,null,null,null,null,this);
            obj.set_taborder("21");
            obj.set_innerdataset("combo");
            obj.set_datacolumn("value");
            obj.set_codecolumn("code");
            obj.set_displaynulltext("항목");
            obj.set_text("항목");
            this.addChild(obj.name, obj);

            obj = new Button("loadBtn","674","359","77","41",null,null,null,null,null,null,this);
            obj.set_taborder("22");
            obj.set_text("불러오기");
            this.addChild(obj.name, obj);

            obj = new Button("saveBtn","759","358","77","41",null,null,null,null,null,null,this);
            obj.set_taborder("23");
            obj.set_text("저장");
            this.addChild(obj.name, obj);

            obj = new Calendar("Calendar00","149","239","120","23",null,null,null,null,null,null,this);
            obj.set_taborder("24");
            this.addChild(obj.name, obj);

            // Layout Functions
            //-- Default Layout : this
            obj = new Layout("default","Desktop_screen",1280,720,this,function(p){});
            this.addLayout(obj.name, obj);
            
            // BindItem Information
            obj = new BindItem("item0","Edit00_00","value","personDs","emp_no");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item1","Edit00","value","personDs","emp_name");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item2","Edit00_00_00","value","personDs","position");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item3","Edit00_00_00_00","value","personDs","department");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item5","Edit00_00_00_00_00_00","value","personDs","emp_phone");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item6","Edit00_00_00_00_00_00_00","value","personDs","emp_email");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item4","Calendar00","value","personDs","hire_date");
            this.addChild(obj.name, obj);
            obj.bind();
        };
        
        this.loadPreloadList = function()
        {

        };
        
        // User Script
        this.registerScript("Form_Work.xfdl", function() {

        this.Button00_01_onclick = function(obj,e)
        {
        	this.personDs.addRow();
        };

        this.Button00_01_00_onclick = function(obj,e)
        {
        	this.personDs.deleteRow(this.personDs.rowposition);
        };


        this.Button00_onclick = function(obj,e)
        {

        	var type=this.type.value;
        	var keyword = this.keyword.value;
        	if(!type || !keyword){
        		this.personDs.filter("");
        	}
        	else{
        		this.personDs.filter(type+"=='"+keyword+"'");
        	}

        };


        this.Button00_00_onclick = function(obj,e)
        {
        	this.personDs.filter("");
        };


        this.keyword_onchanged = function(obj,e)
        {

        };
        //서버로 신호를 보내 데이터를 불러와 personDs에 설정
        //비동기 통신을 사용하여 서버의 주소인 http://localhost:8888/nexacro-server/list.do로 신호를 보낸다
        //서버가 주는 데이터 중에서 이름이 emp인 데이터셋을 찾아 personDs에 설정
        //클라이언트 주소는 http://127.0.0.1:4098/launch.html?screenid=Desktop_screen로 서버 주소와 ip와 포트가 다름 =>CORS오류
        //방법 1) deploy를 같게 설정해주자! (tools-options-path설정 => deploy-paking)
        //넥사크로에서는 transaction(6)이라는 함수로 비동기 통신을 구현한다
        // 		-id : 서블릿(백엔드)에서 구분하기 위한 식별자
        //		-url : 서블릿(백엔드)의 주소. CORS 정책 위반인지 확인
        //		-reqDs : 요청 데이터셋. 서버로 보낼 데이터셋. 저장할 때 전달할 데이터셋을 작성
        // 		-resDs : 응답 데이터셋. 서버에서 받을 데이터 셋.
        //					"personDs=emp" => 서버에서 전달되는 emp이름의 데이터셋을 personDs로 저장해라
        //		-args : 요청에 첨부할 기타 설정값.
        //		-callback : 모든 통신이 끝난 뒤 실행될 예약 함수 이름.
        this.loadBtn_onclick = function(obj,e)
        {
        	var id = "empList";
        	var url = "Origin::list.do";
        	//var url = "http://localhost:8888/nexacro-server/list.do";
        	var reqDs = "";
        	var resDs = "personDs=emp";
        	var args="";
        	var callback="";

        	this.transaction(id,url,reqDs,resDs,args,callback);
        };

        this.afterLoad=function(){
        	this.alert("완료!");
        };
        //화면에 있는 데이터셋을 서버에 전송해서 등록,수정,삭제
        //비동기 통신을 사용하여(트랜젝션) 서버에 데이터셋을 전달
        this.saveBtn_onclick = function(obj,e)
        {
        	var id = "empDs";//서버에 접근할 이름
        	//var url = "http://localhost:8888/nexacro-server/save.do";//서버의 처리 주소.
        	var url = "Origin::save.do";
        	var reqDs = "empList=personDs";//보낼이름=데이터셋이름
        	var resDs = "";
        	var args="";
        	var callback="afterLoad";

        	this.transaction(id,url,reqDs,resDs,args,callback);
        };


        });
        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.addEventHandler("onload",this.loadBtn_onclick,this);
            this.Edit00_00.addEventHandler("onchanged",this.Edit00_00_onchanged,this);
            this.Edit00_00_00_00_00_00_00.addEventHandler("onchanged",this.Edit00_00_00_00_00_00_00_onchanged,this);
            this.keyword.addEventHandler("onchanged",this.keyword_onchanged,this);
            this.Button00.addEventHandler("onclick",this.Button00_onclick,this);
            this.Button00_00.addEventHandler("onclick",this.Button00_00_onclick,this);
            this.Button00_01.addEventHandler("onclick",this.Button00_01_onclick,this);
            this.Button00_01_00.addEventHandler("onclick",this.Button00_01_00_onclick,this);
            this.loadBtn.addEventHandler("onclick",this.loadBtn_onclick,this);
            this.saveBtn.addEventHandler("onclick",this.saveBtn_onclick,this);
        };

        this.loadIncludeScript("Form_Work.xfdl");
        this.loadPreloadList();
        
        // Remove Reference
        obj = null;
    };
}
)();

<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Approve Reject Dual Control</name>
   <tag></tag>
   <elementGuidId>1943c8fc-85ee-4f2b-bf09-0a2d95c2ec43</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xmlns</name>
      <type>Main</type>
      <value>http://www.w3.org/1999/xhtml</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	Approve Reject Dual Control

    
    

    
    
    
        $(document).ready(function(){
            $(&quot;#btnAccept&quot;).click(function(e){
                if(confirm(&quot;Yakin menyetujui transaksi ini?&quot;)){
                    $(&quot;#btnAccept&quot;).after(&quot;&lt;span class='wait'>Loading&lt;/span>&quot;);
                    $(&quot;#btnAccept&quot;).hide();
                }
                else
                    e.preventDefault();
            });
            
            $(&quot;#btnReject&quot;).click(function(e){
                if(confirm(&quot;Yakin menolak transaksi ini?&quot;)){
                    $(&quot;#btnReject&quot;).after(&quot;&lt;span class='wait'>Loading&lt;/span>&quot;);
                    $(&quot;#btnReject&quot;).hide();
                }
                else
                    e.preventDefault();
            });
            
            $(&quot;#btnBack&quot;).click(function(e){
                $(&quot;#btnBack&quot;).after(&quot;&lt;span class='wait'>Loading&lt;/span>&quot;);
                $(&quot;#btnBack&quot;).hide();
            });
            
            var cc = $(&quot;#content-container&quot;);
            if(cc.length > 0){
                if(cc.height() > 250){
                    cc.css(&quot;height&quot;, &quot;250px&quot;);
                    cc.css(&quot;overflow-y&quot;, &quot;auto&quot;);
                }
            }
            
            $(&quot;.showdetail&quot;).click(function(){
                $(this).hide();
            });
        });
    
#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}

    







//&lt;![CDATA[
var theForm = document.forms['form1'];
if (!theForm) {
    theForm = document.form1;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>





	

    
    
        APPROVE/REJECT DUAL CONTROL
        
        
        
            
                
                        
                        
                            
	
		
			SequenceTrancodeTransaction TypeDateUser IdReason 
		
			1144510000094PEMBUKAAN REKENING LOAN NON LAS22/10/2020 08:29:480320131Membutuhkan Override Supervisor
		
	

                        
                    
            
            
    
    
    


/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Page_Approval_2/iframe_approval_2</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>

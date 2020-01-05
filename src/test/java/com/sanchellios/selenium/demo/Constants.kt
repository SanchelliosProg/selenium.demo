package com.sanchellios.selenium.demo

object Urls {
    const val INPUT_FROM_SUBMIT_PAGE_URL = "https://www.seleniumeasy.com/test/input-form-demo.html"
    const val CHECKBOX_PAGE_URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
    const val SELECT_DROPDOWN_PAGE_URL = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"
    const val SIMPLE_INPUT_PAGE_URL =  "https://www.seleniumeasy.com/test/basic-first-form-demo.html"
    const val RADIO_BUTTON_PAGE_URL = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html"
    const val AJAX_FORM_SUBMIT_URL = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html"
}

object CheckBoxPageLocators {
    const val SINGLE_CHECK_BOX_CSS = "input#isAgeSelected"
    const val SINGLE_BOX_LABEL_XPATH = "//label[text()[contains(.,'Click on this')]]"
    const val SINGLE_BOX_TEXT_CSS = "div#txtAge"
    const val MULTI_CHECK_BOX_BUTTON_CSS = "input#check1"
}

object RadioButtonPageLocators {
    const val GET_CHECKED_VALUE_BUTTON_CSS = "button#buttoncheck"

    const val RADIO_0_TO_5_CSS = "input[name=ageGroup][value='0 - 5']"
    const val RADIO_5_TO_15_CSS = "input[name=ageGroup][value='5 - 15']"
    const val RADIO_15_TO_50_CSS = "input[name=ageGroup][value='15 - 50']"
    const val MALE_RADIO_SIMPLE_CSS = "input[value=Male][name=optradio]"
    const val FEMALE_RADIO_SIMPLE_CSS = "input[value=Female][name=optradio]"

    const val MALE_SEX_BUTTON_CSS = "input[name=gender][value=Male]"
    const val FEMALE_SEX_BUTTON_CSS = "input[name=gender][value=Female]"
    const val GET_VALUES_BUTTON = "div.panel-body > button"

    const val RESULT_LABEL_CSS = "p.groupradiobutton"
    const val RADIO_BUTTON_DEMO_LABEL_CSS = "p.radiobutton"
}

object SimpleInputPageLocators {
    const val SHOW_MESSAGE_BUTTON_CSS = "form#get-input button.btn.btn-default"
    const val GET_TOTAL_BUTTON = "form#gettotal button"

    const val TOTAL_RESULT_LABEL = "span#displayvalue"
    const val YOUR_MESSAGE_LABEL_CSS = "#user-message #display"

    const val SINGLE_INPUT_CSS = "input#user-message"
    const val A_INPUT_CSS = "input#sum1"
    const val B_INPUT_CSS = "input#sum2"
}

object SelectDropdownListPageLocators {
    const val DAY_SELECT_CSS = "select.form-control"
    const val STATES_MULTI_SELECT_CSS = "select#multi-select"

    const val SELECTED_VALUE_LABEL_CSS = "p.selected-value"
    const val MULTI_SELECTED_VALUE_LABEL_CSS = "p.getall-selected"

    const val FIRST_SELECTED_BUTTON_CSS = "button#printMe"
    const val GET_ALL_SELECTED_BUTTON_CSS = "button#printAll"
}

object InputFormSubmitPageLocators {
    const val FIRST_NAME_FIELD_CSS = "input[name=first_name]"
    const val LAST_NAME_FIELD_CSS = "input[name=last_name]"
    const val EMAIL_FIELD_CSS = "input[name=email]"
    const val PHONE_FIELD_CSS = "input[name=phone]"
    const val ADDRESS_FIELD_CSS = "input[name=address]"
    const val CITY_FIELD_CSS = "input[name=city]"
    const val ZIP_CODE_FIELD_CSS = "input[name=zip]"
    const val WEBSITE_DOMAIN_NAME_FIELD_CSS = "input[name=website]"
    const val POST_DESCRIPTION_FIELD = "textarea[name=comment]"

    const val HOSTING_YES_RADIO_BUTTON = "input[name=hosting][value=yes]"
    const val HOSTING_NO_RADIO_BUTTON = "input[name=hosting][value=no]"

    const val STATE_SELECT_CSS = "select[name=state]"

    const val SEND_BUTTON_CSS = "button.btn.btn-default"
}

object AjaxFormSubmitPageLocators {
    const val NAME_FIELD_CSS = "input.form-control"
    const val SUBMIT_BUTTON_CSS = "input.btn.btn-primary"
    const val SUBMIT_CONTROL_LABEL_CSS = "div#submit-control"
}
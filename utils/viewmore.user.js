// ==UserScript==
// @name         Auto View More
// @namespace    http://tampermonkey.net/
// @version      0.1
// @description  View More info on Leaderboard without clicking
// @author       Cladius
// @match        https://www.techgig.com/codegladiators/top-ranker
// @icon         https://www.google.com/s2/favicons?sz=64&domain=techgig.com
// @homepage     https://github.com/cladius/solution
// @grant        none
// ==/UserScript==

// document
// https://developer.chrome.com/docs/extensions/mv3/
(function() {
    'use strict';

    const sleep = t => new Promise(s => setTimeout(s, t));

    async function getMoreGladiators() {
        // Count down
        let i = 30; //Number of times to 'click' on the View More link
        while (i--) {
            await sleep(400); //Sleep for 400 millisecs
            document.getElementById("ViewMore").click(); //'Click' the View More link
        }
    }

    getMoreGladiators();

})();

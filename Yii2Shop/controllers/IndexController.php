<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/18
 * Time: 10:37
 */
namespace app\controllers;

use yii\web\Controller;

class IndexController extends Controller
{
    public function actionIndex()
    {
        $this->layout = "layout1";
        //viex/index/index.php
        return $this->render("index");
    }
}
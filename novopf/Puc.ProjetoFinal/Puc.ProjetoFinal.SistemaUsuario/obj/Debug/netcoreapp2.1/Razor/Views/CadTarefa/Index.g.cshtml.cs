#pragma checksum "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "5f8c85deeaf1981cff32aa795a96972125dba377"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_CadTarefa_Index), @"mvc.1.0.view", @"/Views/CadTarefa/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/CadTarefa/Index.cshtml", typeof(AspNetCore.Views_CadTarefa_Index))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.SistemaUsuario;

#line default
#line hidden
#line 2 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.SistemaUsuario.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"5f8c85deeaf1981cff32aa795a96972125dba377", @"/Views/CadTarefa/Index.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"1f016fde058de82b470cb4ba22deaf16b7b67d7f", @"/Views/_ViewImports.cshtml")]
    public class Views_CadTarefa_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<IEnumerable<Puc.ProjetoFinal.SistemaUsuario.Models.TarefaModel>>
    {
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_0 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("src", new global::Microsoft.AspNetCore.Html.HtmlString("~/lib/jquery/dist/jquery.js"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_1 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("src", new global::Microsoft.AspNetCore.Html.HtmlString("~/lib/jquery-ui/jquery-ui.js"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_2 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("asp-action", "Incluir", global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_3 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("class", new global::Microsoft.AspNetCore.Html.HtmlString("btn"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        #line hidden
        #pragma warning disable 0169
        private string __tagHelperStringValueBuffer;
        #pragma warning restore 0169
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperExecutionContext __tagHelperExecutionContext;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner __tagHelperRunner = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner();
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __backed__tagHelperScopeManager = null;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __tagHelperScopeManager
        {
            get
            {
                if (__backed__tagHelperScopeManager == null)
                {
                    __backed__tagHelperScopeManager = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager(StartTagHelperWritingScope, EndTagHelperWritingScope);
                }
                return __backed__tagHelperScopeManager;
            }
        }
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper;
        private global::Microsoft.AspNetCore.Mvc.TagHelpers.AnchorTagHelper __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper;
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(71, 1, true);
            WriteLiteral("\n");
            EndContext();
#line 3 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
  
    ViewData["Title"] = "Cadastrar Tarefa";
    Layout = "~/Views/Shared/_Layout.2.cshtml";

#line default
#line hidden
            BeginContext(169, 1, true);
            WriteLiteral("\n");
            EndContext();
            DefineSection("scripts", async() => {
                BeginContext(188, 5, true);
                WriteLiteral("\n    ");
                EndContext();
                BeginContext(193, 51, false);
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("script", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "6f7df317c8634f1d8715106df5e60c64", async() => {
                }
                );
                __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper);
                __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_0);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                EndContext();
                BeginContext(244, 5, true);
                WriteLiteral("\n    ");
                EndContext();
                BeginContext(249, 52, false);
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("script", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "f55ba0728adc464eb0a63f4a763cd9e2", async() => {
                }
                );
                __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper);
                __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_1);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                EndContext();
                BeginContext(301, 819, true);
                WriteLiteral(@"
    <script>
        $(function() {
            $('a[id*=btnRemover]').click(function (e) {
                debugger;
                e.preventDefault();
                var id = $(this).parent()[0].id;
                $('#confirmDialog').data('id', id).dialog('open');
            });

            $(""#confirmDialog"").dialog({
                autoOpen: false,
                modal: true,
                resizable: false,
                buttons: {
                    ""Ok"": function () {
                        var id = $(this).data(""id"");
                        window.location.href = '/CadTarefa/Remover/' + id;
                    },
                    ""Cancel"": function (e) {
                        $(this).dialog(""close"");
                    }
                }
            });
        });
    </script>
");
                EndContext();
            }
            );
            BeginContext(1122, 43, true);
            WriteLiteral("\n    <br />\n\n    <h1 class=\"titulo-pagina\">");
            EndContext();
            BeginContext(1166, 17, false);
#line 40 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                         Write(ViewData["Title"]);

#line default
#line hidden
            EndContext();
            BeginContext(1183, 43, true);
            WriteLiteral("</h1>\n\n    <div class=\"div-right\">\n        ");
            EndContext();
            BeginContext(1226, 47, false);
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("a", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "485701b0bf204f2aa3d48671a7f631c5", async() => {
                BeginContext(1262, 7, true);
                WriteLiteral("Incluir");
                EndContext();
            }
            );
            __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.AnchorTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper);
            __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper.Action = (string)__tagHelperAttribute_2.Value;
            __tagHelperExecutionContext.AddTagHelperAttribute(__tagHelperAttribute_2);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_3);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            EndContext();
            BeginContext(1273, 176, true);
            WriteLiteral("\n    </div>\n\n    <div class=\"well\">\n        <table class=\"table dataTable no-footer\">\n            <thead>\n                <tr>\n                    <th>\n                        ");
            EndContext();
            BeginContext(1450, 44, false);
#line 51 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.IdTarefa));

#line default
#line hidden
            EndContext();
            BeginContext(1494, 76, true);
            WriteLiteral("\n                    </th>\n                    <th>\n                        ");
            EndContext();
            BeginContext(1571, 42, false);
#line 54 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.Titulo));

#line default
#line hidden
            EndContext();
            BeginContext(1613, 76, true);
            WriteLiteral("\n                    </th>\n                    <th>\n                        ");
            EndContext();
            BeginContext(1690, 44, false);
#line 57 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.DtTarefa));

#line default
#line hidden
            EndContext();
            BeginContext(1734, 76, true);
            WriteLiteral("\n                    </th>\n                    <th>\n                        ");
            EndContext();
            BeginContext(1811, 49, false);
#line 60 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.IdFuncionario));

#line default
#line hidden
            EndContext();
            BeginContext(1860, 120, true);
            WriteLiteral("\n                    </th>\n                    <th></th>\n                </tr>\n            </thead>\n            <tbody>\n");
            EndContext();
#line 66 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
             foreach (var item in Model) {

#line default
#line hidden
            BeginContext(2023, 70, true);
            WriteLiteral("                <tr>\n                    <td>\n                        ");
            EndContext();
            BeginContext(2094, 43, false);
#line 69 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.IdTarefa));

#line default
#line hidden
            EndContext();
            BeginContext(2137, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(2214, 41, false);
#line 72 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.Titulo));

#line default
#line hidden
            EndContext();
            BeginContext(2255, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(2332, 43, false);
#line 75 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.DtTarefa));

#line default
#line hidden
            EndContext();
            BeginContext(2375, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(2452, 51, false);
#line 78 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.Funcionario.Nome));

#line default
#line hidden
            EndContext();
            BeginContext(2503, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(2580, 86, false);
#line 81 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.ActionLink("Editar", "Editar", new { id=item.IdTarefa }, new { @id="btnEditar" }));

#line default
#line hidden
            EndContext();
            BeginContext(2666, 27, true);
            WriteLiteral(" |\n                        ");
            EndContext();
            BeginContext(2694, 89, false);
#line 82 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
                   Write(Html.ActionLink("Remover", "Remover", new { id=item.IdTarefa }, new { @id="btnRemover" }));

#line default
#line hidden
            EndContext();
            BeginContext(2783, 49, true);
            WriteLiteral("\n                    </td>\n                </tr>\n");
            EndContext();
#line 85 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadTarefa/Index.cshtml"
        }

#line default
#line hidden
            BeginContext(2842, 172, true);
            WriteLiteral("            </tbody>\n        </table>\n    </div>\n\n    <div id=\"confirmDialog\" title=\"Remover Tarefa\" hidden>\n        <p>Você confirmar a exclusão da Tarefa?</p>\n    </div>\n");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<IEnumerable<Puc.ProjetoFinal.SistemaUsuario.Models.TarefaModel>> Html { get; private set; }
    }
}
#pragma warning restore 1591

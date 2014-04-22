<%@ Page Title="Contact" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Rastreador.aspx.cs" Inherits="WebApplication.Rastreador" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <hgroup class="title">
        <h1>&nbsp;Rastreador de Links</h1>
    </hgroup>

    <br />
                <asp:Label ID="lblMensagemRastreamento" runat="server" Font-Bold="True" ForeColor="Red"></asp:Label>

    <br />
&nbsp; Link&nbsp;
<asp:TextBox ID="txtLinkRastreamento" runat="server" Width="350px"></asp:TextBox>
&nbsp;&nbsp;&nbsp; Nivel&nbsp;&nbsp;
<asp:DropDownList ID="cmbNivel" runat="server" Height="30px" Width="81px">
    <asp:ListItem Selected="True">1</asp:ListItem>
    <asp:ListItem>2</asp:ListItem>
    <asp:ListItem>3</asp:ListItem>
    <asp:ListItem>4</asp:ListItem>
    <asp:ListItem>5</asp:ListItem>
</asp:DropDownList>
&nbsp;
<asp:Button ID="btnRastreamento" runat="server" OnClick="btnRastreamento_Click" Text="Iniciar Rastreamento" Width="186px" />
<br />
<br />
<br />
</asp:Content>